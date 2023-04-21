import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { UserSubmit } from './userSubmit';
import { PostService } from '../post.service';
@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent {

  baseUrl: string = "http://localhost:8080/users/"
  model: UserSubmit;
  constructor(private http: HttpClient, private service: PostService) {
    this.model = new UserSubmit("", 0, 0);
  }

  onSubmit(submitform: any) {
    //alert(`Name: ${this.model.name}\nAge: ${this.model.age}\nSalary: ${this.model.salary}`);
    this.service.addUser(this.model).subscribe(
      model => {
        console.log('User added successfully', model);
        submitform.resetForm();
      },
      error => console.error('Error adding user: ', error)
    );
  }

  onReset(form: NgForm) {
    form.resetForm();
  }
  refresh() {
    window.location.reload();
  }
}


