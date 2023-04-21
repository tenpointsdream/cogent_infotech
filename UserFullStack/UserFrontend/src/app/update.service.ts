import { Injectable } from '@angular/core';
import { User } from './user.entity';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UpdateService {
  private baseUrl = 'http://localhost:8080/users/';
  constructor(private httpClient: HttpClient) { }
  update(user: User): Observable<User> {
    // const url = `${this.baseUrl}/${id}`
    return this.httpClient.put<User>(this.baseUrl, user);
  }
}
