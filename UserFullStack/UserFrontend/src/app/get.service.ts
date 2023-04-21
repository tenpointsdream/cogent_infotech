import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class GetService {
  private url = 'http://localhost:8080/users/';
  constructor(private httpClient: HttpClient) { }
  getUsers() {
    return this.httpClient.get(this.url);
  }
}
