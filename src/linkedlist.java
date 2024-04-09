class node{
    public int nodedata;
    public node nextnode;
}
public class linkedlist{
    private node head;
    public void displaylinkedlist(){
        node currentnode=head;
        while(currentnode!=null){
            System.out.println(currentnode.nodedata);
            currentnode=currentnode.nextnode;
            // this function is for displaying all the elements in the list.
        }
        System.out.println("NULL list");
    }
    public void insertatfront(int data){
        node newnode= new node();//creating new node
        newnode.nodedata=data;//creating new node
        newnode.nextnode=head;
        head=newnode;
    }
    public void insertatlast(int data){
        node currentnode=head;
        while(currentnode.nextnode!=null){
            currentnode=currentnode.nextnode;
        }
        node newnode= new node();//creating node
        newnode.nodedata= data;
        currentnode.nextnode=newnode;
    }
    public void deleteatfront(){
        head=head.nextnode;//2nd value will become the head
    }
    public void deleteaatlast(){
        node currentnode=head;
        if(head.nextnode==null){
            head=null;
        }
        else{
            while(currentnode.nextnode.nextnode!=null){
                currentnode=currentnode.nextnode;
            }
            currentnode.nextnode=null;
        }
    }
    public void insertatpos(int data,int pos){
        node currentnode=head;
        node tempnode=head;
        for(int i=0;i<pos-1;i++){
            currentnode=currentnode.nextnode;
            tempnode=tempnode.nextnode;
        }
        currentnode=currentnode.nextnode;
        node newnode = new node();//created a  new node
        tempnode.nextnode=newnode;// temp== newnode
        newnode.nodedata=data;//storing data in newnode
        newnode.nextnode=currentnode;//newnode==currentnode
    }
    public void deletepos(int pos){
        if(head==null){
            return;
        }
        node temp=head;
        if(pos==1){
            head=temp.nextnode;
            return;
        }
        for(int i=0;temp!=null&&i<pos-1;i++){
            temp=temp.nextnode;
        }
        if(temp==null||temp.nextnode==null){
            System.out.println("position enetered is more than the number of elements in the list");
            return;
        }
        node next=temp.nextnode.nextnode;
        temp.nextnode=next;
    }
    public static void main(String[] args) {
        linkedlist l =new linkedlist();
        l.insertatfront(10);
        l.insertatlast(5);
        l.insertatlast(8);
        l.insertatfront(7);
        l.deletepos(2);
        l.displaylinkedlist();
    }


}