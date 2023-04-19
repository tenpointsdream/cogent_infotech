import { Component } from '@angular/core';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent {
  productNo: number = 1001;
  productName: string = "MacBook Pro";
  productPrice: number = 1999;
  ImgUrl: string = "https://m.media-amazon.com/images/I/51cGnxlXcyL.jpg";
  name: string = "Mr. Khoa";
  message() {
    alert("Did you click the button?");
  }
}
