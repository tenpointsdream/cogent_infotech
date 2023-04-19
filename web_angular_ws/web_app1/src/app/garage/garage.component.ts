import { Component } from '@angular/core';
import { CarEntity } from '../car.entity';
@Component({
  selector: 'app-garage',
  templateUrl: './garage.component.html',
  styleUrls: ['./garage.component.css']
})
export class GarageComponent {

  public cars: Array<CarEntity>;
  constructor() {
    var carOne: CarEntity = new CarEntity("Honda", "Red");
    var carTwo: CarEntity = new CarEntity("Renault", "Blue");
    var carThree: CarEntity = new CarEntity("Maruti", "White");
    this.cars = [carOne, carTwo, carThree];
  }
}
