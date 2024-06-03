class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        List<List<String>> answer = new  ArrayList<List<string>>();
    Map<String,List<String>> map = new HashMap<String,List <String>>();
     
    for(String str:strs)
        {
            char[] arr = str.toCharArray(); //string to array//
            Array.sort(arr);             //sort the array//  
            String s = new String(arr); //array to string//
        
        }
        if(map.containsKey(s))
        {    
            List<String> list= map.get(s);//fetch value from created list
            list.add(str);
            map.put(s,list);

           
        }
    
        else
        {   
            list<String> list  = new ArrayList<String>();//create blank list
            list.arr(st);
            map.put(s,list);
        }

        for(List<String> list : map.values())
        {
            answer.add(list1);
        }
        return answer;
     
    }
    

}

//T.C = O(n)

//S.C = O(n)
