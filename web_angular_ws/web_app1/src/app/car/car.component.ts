import { Component, Input } from '@angular/core';
import { CarEntity } from '../car.entity';

@Component({
  selector: 'app-car',
  templateUrl: './car.component.html',
  styleUrls: ['./car.component.css']
})
export class CarComponent {
  @Input()
  car!: CarEntity;
  constructor() {
    console.log("Garage");
  }
}
