import { Component } from '@angular/core';
import { ItemEntity } from '../item.entity';

@Component({
  selector: 'app-item-list',
  templateUrl: './item-list.component.html',
  styleUrls: ['./item-list.component.css']
})
export class ItemListComponent {
  public items: Array<ItemEntity>;
  constructor() {
    var i1 = new ItemEntity("Mouse", 99);
    var i2 = new ItemEntity("Monitor", 459);
    var i3 = new ItemEntity("MacBook Pro", 1999);
    var i4 = new ItemEntity("Webcam", 79);
    var i5 = new ItemEntity("Keyboard", 249);
    this.items = [i1, i2, i3, i4, i5];
  }
}
