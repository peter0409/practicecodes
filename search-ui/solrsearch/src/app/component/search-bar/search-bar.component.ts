import { Employee } from './../employee';
import { EmployeeService } from './../../service/employee.service';
import { Component, ElementRef, EventEmitter, OnInit } from '@angular/core';
import { fromEvent } from 'rxjs';
import { map, filter, debounceTime, tap, switchAll } from 'rxjs/operators';
import { Output } from '@angular/core';

@Component({
  selector: 'app-search-bar',
  templateUrl: './search-bar.component.html',
  styleUrls: ['./search-bar.component.css']
})
export class SearchBarComponent implements OnInit {

  @Output() loading = new EventEmitter<boolean>();
  @Output() results = new EventEmitter<Employee[]>();

  constructor(
    private employee : EmployeeService,
    private el : ElementRef
  ) { }

  ngOnInit() {
    // convert the `keyup` event into an observable stream
    fromEvent(this.el.nativeElement, 'keyup').pipe(
      map((e: any) => e.target.value), // extract the value of the input
      filter(text => text.length > 1), // filter out if empty
      debounceTime(500), // only once every 500ms
      tap(() => this.loading.emit(true)), // enable loading
      map((query: string) => this.employee.search(query)), // search
      switchAll()) // produces values only from the most recent inner sequence ignoring previous streams
      .subscribe(  // act on the return of the search
        _results => {
          this.loading.emit(false);
          this.results.emit(_results);
        },
        err => {
          console.log(err);
          this.loading.emit(false);
        },
        () => {
          this.loading.emit(false);
        }
      );
  }

}
