import { Component, OnInit } from '@angular/core';
import { GetService } from '../get.service';
import { UpdateService } from '../update.service';
import { DeleteService } from '../delete.service';
import { User } from '../user.entity';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent implements OnInit {
  onVisible: boolean = false;
  users: any;
  user: any;
  editIndex = -1;
  editName = '';
  editAge = 0;
  editSalary = 0;
  constructor(
    private getService: GetService,
    private updateService: UpdateService,
    private deleteService: DeleteService) {
  }
  cancelEdit() {
    this.onVisible = false;
  }
  editUser(id: number, name: string, age: number, salary: number) {
    this.onVisible = true;
    this.editIndex = id;
    this.editName = name;
    this.editAge = age;
    this.editSalary = salary;
  }
  ngOnInit(): void {
    this.getService.getUsers().subscribe(response => {
      this.users = response;
    })
  }
  updateUser(editform: any) {
    this.user.id = this.editIndex;
    this.user.name = editform.value.name;
    this.user.age = editform.value.age;
    this.user.salary = editform.value.salary;
    this.updateService.update(this.user);
    this.onVisible = false;
    this.editIndex = -1;
    this.editName = '';
    this.editAge = 0;
    this.editSalary = 0;
  }
  deleteUser(id: number) {
    this.deleteService.delete(id);
  }
  onReset(form: NgForm) {
    form.resetForm();
  }
  refresh() {
    window.location.reload();
  }
}

