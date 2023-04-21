import { Component, OnInit } from '@angular/core';
import { GetService } from '../get.service';
import { UpdateService } from '../update.service';
import { DeleteService } from '../delete.service';
import { User } from '../user.entity';

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent implements OnInit {
  onVisible:boolean = false;
  users: any;
  constructor(
    private getService: GetService,
    private updateService: UpdateService,
    private deleteService: DeleteService) {
  }
  cancelEdit(){
    this.onVisible = false;
  }
  editUser(){
    this.onVisible = true;
  }
  ngOnInit(): void {
    this.getService.getUsers().subscribe(response => {
      this.users = response;
    })
  }
  updateUser(user: User){
    this.updateService.update(user);
  }
  deleteUser(id: number) {
    this.deleteService.delete(id);
  }
}
