let tipRate = .10;
let billAmount = 58.00

function findTipAmount() {
    return billAmount * tipRate;
}
// IN this example the claaback function is "findTipAmount()"
// being that the function figures out how much the tip amount is.
// then the console is directed to use that function and add the result 
// to get the total bill amount 
let myBill = billAmount + findTipAmount();
console.log("My total bill is $ " + myBill + ".");