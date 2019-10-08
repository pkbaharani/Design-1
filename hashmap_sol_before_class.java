class MyHashMap {

    /** Initialize your data structure here. */
    mapNode head;
    class mapNode{
       
        int key;
        int value;
        mapNode next;
       
        mapNode(int k, int v)
        {
            this.key=k;
            this.value=v;
            this.next=null;
        }
       
       
    }
    public MyHashMap() {
        head=null;
    }
   
    /** value will always be non-negative. */
    public void put(int key, int value) {
       
        mapNode mn=new mapNode(key,value);
       
        if(head==null)
        {
            head=mn;
            return;  
        }
       
        mapNode temp1=head;
       
       
        while(temp1.next!=null)
        {
            if(temp1.key==key)
            {
                temp1.value=value;
                return;
            }
            temp1=temp1.next;
        }
        if(temp1.key==key)
            {
                temp1.value=value;
                return;
            }
       
        temp1.next=mn;
       
       
       
    }
   
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
       
        if(head==null)
        {
            return -1;
           
        }
        mapNode temp1=head;
        if(temp1.key==key)
            {
                return temp1.value;
            }
        while(temp1.next!=null)
        {
            if(temp1.key==key)
            {
                return temp1.value;
            }
            temp1=temp1.next;
           
        }
       
        if(temp1.key==key)
            {
                return temp1.value;
            }
        return -1;
       
       
    }
   
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
       
        if(head==null)
        {
            return;
        }
       
        mapNode temp1,temp2;
        temp1=head;
        temp2=temp1;
        temp1=temp1.next;
        
         if(temp2.key==key)
        {
            head=temp2.next;
        }
        if(temp1==null)
        {
            return;
        }
        if(temp1.key==key)
        {
            temp2.next=temp1.next;  
        }
       
        while(temp1.next!=null)
        {
            if(temp1.key==key)
            {
                temp2.next=temp1.next;  
            }
            temp2=temp1;
            temp1=temp1.next;
           
        }
       
        if(temp1.key==key)
            {
                temp2.next=temp1.next;  
            }
       
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
