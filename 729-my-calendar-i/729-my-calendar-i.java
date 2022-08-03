class MyCalendar {
    private TreeMap<Integer, Integer> map = new TreeMap<>();
  public MyCalendar() {

  }

  public boolean book(int start, int end) {
    Map.Entry<Integer, Integer> e = map.floorEntry(end - 1);
    if (e != null && e.getValue() > start) return false;
    map.put(start, end);
    return true;
  }
    
    // Naive Solution 
//   HashMap<Integer, Integer> map = new HashMap<>();
//     public MyCalendar() {
       
//     }
    
//     public boolean book(int s, int ed) {
//         for(Map.Entry<Integer, Integer> h : map.entrySet()){
//             if(!(h.getKey() >= ed || s >= h.getValue())){
//                 return false;
//             }
//         }
//         map.put(s, ed);
//         return true;
//     }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */