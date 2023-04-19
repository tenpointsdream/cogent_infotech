import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-deposit',
  templateUrl: './deposit.component.html',
  styleUrls: ['./deposit.component.css']
})
export class DepositComponent {

  //amount: number = 0;
  @Output() newDepositEvent = new EventEmitter<number>();

  deposit(amount: any) {
    const newAmount = parseInt(amount);
    this.newDepositEvent.emit(newAmount);
  }
}