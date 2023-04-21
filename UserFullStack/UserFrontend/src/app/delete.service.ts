import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from './user.entity';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DeleteService {
  private baseUrl = 'http://localhost:8080/users/';
  constructor(private httpClient: HttpClient) { }
  delete(id: number): Observable<User> {
    const url = `${this.baseUrl}/${id}`
    return this.httpClient.delete<User>(url);
  }
}
