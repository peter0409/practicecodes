import { Employee } from './../component/employee';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor( private http : HttpClient) { }

  search(query: string): Observable<any> {
    const params: string = [
      `q=${query}`,
      `part=snippet`,
      `type=employee`,
      `maxResults=10`
    ].join('&');

    const queryURL = "http://localhost:8089/employees?" + params;

    console.log(queryURL);
  
    return this.http.get(queryURL);
  }

}
