import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from './user.entity';
@Injectable({
  providedIn: 'root'
})
export class PostService {
  private baseUrl = 'http://localhost:8080/users/';
  constructor(private httpClient: HttpClient) { }
  addUser(user: User): Observable<User> {
    return this.httpClient.post<User>(this.baseUrl, user);
  }
}
