class Node{
    constructor(value){
        this.value = value;
        this.next = null;
    }
}

class List{
    constructor(){
        this.head = null;
        this.size = 0;
    }
    add(value){
        let node = new Node(value);
        if  ((this.head) == null){
            this.head = node;
        }
        else{
            let temp = this.head;
            while (temp.next != null){
                temp = temp.next;
                
            }
            temp.next = node;
        }
        this.size++;
        
    }
    insertAt(value, index){
        if(index < 0 || index > this.size){
            return console.log("Invalid index")
        }
        else{
            let node = new Node(value);
            if(index == 0){
                node.next = this.head;
                this.head = node;
            }
            else{
                let temp = this.head;
                let curr = 0;
                while(curr < index-1){
                    temp = temp.next;
                    curr++;
                }
                node.next = temp.next;
                temp.next = node;

            }
            this.size++;
        }
    }
    //remove from an index
    remove(index){
        if(index < 0 || index > this.size){
            return (console.log("Invalid index"))
        }
        else{
            if(index == 0){
                this.head = this.head.next;
            }
            else
            {
                let temp = this.head;
                let curr = 0;
                while(curr < index-1){
                    temp = temp.next;
                    curr++;
                }
                temp.next = temp.next.next;
            }
            this.size--;
        }
        
    }
    //remove a given element
    removeAnElement(value){
       let curr = this.head;
       let prev = null;
       while(curr){
        if(curr.value == value){
            if(prev == null){
                this.head = curr.next
            }
            else{
                prev.next = curr.next;

            }
            this.size--;
            return 
        }
        prev = curr;
        curr = curr.next;
       }
       return 
    }
    //find index of given element
    findIndex(value){
        let index = 0;
        let curr = this.head;
        while(curr){
            if(curr.value == value){
                return (console.log(`index of ${value} is ${index}.`))
            }
            else{
                index++;
                curr = curr.next;
            }
        }
    }
    //check list is empty
    isEmpty(){
        if(this.head){
            return (console.log(`the list is not empty`))
        }
        else{
            return(console.log("the list is empty"))
        }
    }

    //return size of list
    sizeof(){
        return this.size
    }
    print(){
        let temp = this.head;
        let str = ""
        while(temp){
            str += temp.value + " "
            temp = temp.next;
        }
        console.log(str);
    }
}
var listItem = new List();
listItem.add(0);
listItem.add(1);
listItem.add(2);
listItem.add(4);
listItem.add(5);
listItem.insertAt(3,3);
listItem.findIndex(3);
listItem.removeAnElement(22);
listItem.isEmpty();
listItem.sizeof();
// listItem.insertAt(3,0);

console.log(listItem);
listItem.print();
