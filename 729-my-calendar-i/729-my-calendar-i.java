class MyCalendar {
  HashMap<Integer, Integer> map = new HashMap<>();
    public MyCalendar() {
       
    }
    
    public boolean book(int s, int ed) {
        for(Map.Entry<Integer, Integer> h : map.entrySet()){
            if(!(h.getKey() >= ed || s >= h.getValue())){
                return false;
            }
        }
        map.put(s, ed);
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */