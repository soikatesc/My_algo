var prompt = require('prompt')
// Node = require('./creating_node')
// console.dir(Node)
// Node = require('./creating_node')
LinkedList = require('./creating_node')

console.dir(LinkedList)

var list = new LinkedList()
list.addFront(5)
list.addFront(1)
list.addFront(11)
list.addFront(6)
list.addFront(2)
list.addFront(3)
list.contains(7)
list.removeFront()
// list.removeFront()
console.log(list)
console.log(list.Front())
console.log(list.Length())
list.display()
console.log('Max', list.max())
console.log('Min:', list.min())
console.log(list.back())
list.removeBack()
list.display()
list.addBack(9)
list.addBack(10)
list.display()
list.MoveMinFront()
list.display()
list.MoveMaxBack()
list.display()
list.prependVal(2, 100)
list.display()
// list.prependVal(3, 13)
// list.display()
// prompt.start();
// prompt.get(['value'], function (err, result) {
//     console.log('Command-line input received:');
//     console.log('  Value: ' + result.value);
//     list.addBack(result.value)
//     list.display()
// });


