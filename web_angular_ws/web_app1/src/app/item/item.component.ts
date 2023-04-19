import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-item',
  templateUrl: './item.component.html',
  styleUrls: ['./item.component.css']
})
export class ItemComponent {
  itemNo: number[] = [1111, 2222, 3333, 4444, 5555];
  itemName: string[] = ["Laptop", "Mouse", "Keyboard", "Webcam", "Monitor"];
  itemPrice: number[] = [2000, 100, 150, 70, 500];
  // itemDescription: string = "This item is a piece of armor that will protect you from nothing at all!";
  imgUrl: string[] = ["https://m.media-amazon.com/images/I/51cGnxlXcyL.jpg",
    "https://m.media-amazon.com/images/I/718b9wK3eaL._AC_SY450_.jpg",
    "https://m.media-amazon.com/images/I/51jkxo3a7bL._AC_SY450_.jpg",
    "https://m.media-amazon.com/images/I/71iNwni9TsL._AC_SY355_.jpg",
    "https://m.media-amazon.com/images/I/41bG3mlnQdL._AC_SY450_.jpg"];

  editingIndex = -1;
  editingItemName = '';
  editingItemPrice = 0;
  editingItemImgUrl = '';

  deleteItem(index: number) {
    this.itemNo.splice(index, 1);
    this.itemName.splice(index, 1);
    this.itemPrice.splice(index, 1);
    this.imgUrl.splice(index, 1);
  }

  showEditForm(index: number) {
    this.editingIndex = index;
    this.editingItemName = this.itemName[index];
    this.editingItemPrice = this.itemPrice[index];
    this.editingItemImgUrl = this.imgUrl[index];
  }

  updateItem() {
    // Check that the editingIndex is within the bounds of the array
    if (this.editingIndex < 0 || this.editingIndex >= this.itemNo.length) {
      console.error('Invalid editing index:', this.editingIndex);
      return;
    }

    // Update the item's properties
    this.itemName[this.editingIndex] = this.editingItemName;
    this.itemPrice[this.editingIndex] = this.editingItemPrice;
    this.imgUrl[this.editingIndex] = this.editingItemImgUrl;

    // Reset the editing index and form fields
    this.editingIndex = -1;
    this.editingItemName = '';
    this.editingItemPrice = 0;
    this.editingItemImgUrl = '';
  }

  cancelEdit() {
    this.editingIndex = -1;
    this.editingItemName = '';
    this.editingItemPrice = 0;
    this.editingItemImgUrl = '';
  }
}
