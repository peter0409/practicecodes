import { Component } from '@angular/core';
import { Employee } from './component/employee';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  results : Employee[];
  loading : boolean;
  message : String;
  title = 'solrsearch';

  updateResults(results: Employee[]): void {
    this.results = results;
    if (this.results.length === 0) {
      this.message = "Not found...";
    } else {
      this.message = 'Top 10 results:';
    }
  }
}
