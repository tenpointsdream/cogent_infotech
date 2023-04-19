import { Component, Input } from '@angular/core';
import { ItemEntity } from '../item.entity';

@Component({
  selector: 'app-item',
  templateUrl: './item.component.html',
  styleUrls: ['./item.component.css']
})
export class ItemComponent {

  @Input()
  item!: ItemEntity;
  constructor(){
    console.log("In Item Component!");
  }
}
