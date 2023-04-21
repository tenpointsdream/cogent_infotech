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
  constructor(
    private getService: GetService,
    private updateService: UpdateService,
    private deleteService: DeleteService) {
  }
  cancelEdit(){
    this.onVisible = false;
  }
  editUser(id: number) {
    this.onVisible = true;
    this.user.id = id;
  }
  ngOnInit(): void {
    this.getService.getUsers().subscribe(response => {
      this.users = response;
    })
  }
  updateUser(editform: any) {
    this.user.name = editform.value.name;
    this.user.age = editform.value.age;
    this.user.salary = editform.value.salary;
    this.updateService.update(this.user);
    this.onVisible = false;
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

