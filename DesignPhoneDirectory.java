//n--> maxNumbers in directory
// Time Complexity : check,release O(1)    get O(n) --> remove method in Hashset requires object to be passed. Hence we had to iterate untill we found a object
// Space Complexity : O(n)   HashSet
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
 /* 
 Use HashSet for all operations.
 */

class PhoneDirectory{
    HashSet<Integer> hs;

    public PhoneDirectory(int maxNumbers){
        hs = new HashSet<Integer>();
        for(int i=0;i<maxNumbers;i++){
            hs.add(i);
        }
    }

    public int get(){
        Iterator it = hs.iterator();
        while(it.hasNext()){
            int x = it.next();
            hs.remove(x);
            break;
        }
        return x;
    }

    public boolean check(int number){
        if(hs.contains(number)) ? return true : false;

    }

    public void release(int number){
        hs.add(number);
    }

}




//n--> maxNumbers in directory
// Time Complexity : check,release,get O(1)    
// Space Complexity : O(n) HashSet,Queue
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
 /* 
 Use HashSet for check, release.
 and Queue for get as it would take O(1) time to remove
 */

class PhoneDirectory{
    HashSet<Integer> hs;
    Queue<Integer> q;

    public PhoneDirectory(int maxNumbers){
        hs = new HashSet<Integer>();
        q = new LinkedList<>();
        for(int i=0;i<maxNumbers;i++){
            hs.add(i);
            q.add(i);
        }
    }

    public int get(){
        Iterator it = hs.iterator();
        (!q.isEmpty()){
            int x = q.poll();
            hs.remove(x);
        }
        return x;
    }

    public boolean check(int number){
        if(hs.contains(number)) ? return true : false;
    }

    public void release(int number){
        hs.add(number);
        q.add(number);
    }


}