//Iterative Solution

public int length(){
int count=0;
Node current = this.head;

while(current != null){
count++;
current=current.next()
}
return count;
}

//Recursive Solution

public int length(Node current){
if(current == null) //base case
return 0;

return 1+length(current.next());
}
