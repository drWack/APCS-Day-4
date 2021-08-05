import java.util.*; //arrayList,COllections,Random


class Main {
  public static void main(String[] args) {
  
  
  String[] myStrings = {"public","static","void","main", "static","string","main"};
  
//hashtable <- faster if only one computer is accessing, permits nulls
//HashMap <-default
//linkedHashMap<-data is spread dynamically throgh memory
//TreeMap<-Keys are sorted in a tree


  Map<String,Boolean> words = new HashMap<String,Boolean>();
                            // the new keyword in java


   words = wordMultiple(myStrings);

  for(String s : myStrings){
    System.out.println("("+s +","+ words.get(s)+")");
  }



  
}


  public static boolean sameFirstLast(int[] nums){
    //return true if array length >1, 
    //arr.1 == arr.sameFirstLast
    if(nums.length >=1){
      if(nums[0] == nums[nums.length-1]){
        return true;
      }
    }
    return false;
  }
  public static int[] evenOdd(int[] nums){ //o(n)time and space
    ArrayList<Integer> evens = new ArrayList<Integer>();
    ArrayList<Integer> odds = new ArrayList<Integer>();
    for(int i : nums){
      if(i%2==0){
        evens.add(i);
      }
      else{
        odds.add(i);
      }
    }

    int[] myArray = new int[nums.length]; 

    int i=0;
    int evensSize = evens.size();

    for(i=0; i <evensSize; i++){
      myArray[i] = evens.remove(0);
    }
    for(i = evensSize; i<nums.length;i++){
      myArray[i]=odds.remove(0);
    }

     return myArray;
  }

  public static Map<String,String> MapAB(Map<String,String> map){
      //check if map cotains a and b
      // if both, add a new key, ab, that maps to a+b
      if(map.containsKey("a") == true){
        if(map.containsKey("b")==true){
          String result = map.get("a") + map.get("b");
          map.put("ab", result);
        }
      }
    return map; 
  }

  public static Map<String,String> MapBully(Map<String,String> mymap){
    // the b key takes whatever the a key's value is
    //leaving the a key with ""
    if(mymap.containsKey("a")){
      String candy = mymap.get("a");
      mymap.put("b",candy); 
      mymap.remove("a");
      mymap.put("a","");
    }
    return mymap;
  }

  public static Map<String,Boolean> wordMultiple(String[] strings){
      //take in string[], map each string as a key to a boolean
      // if a string appears more than once, map to true
      Map<String,Boolean> mymap = new HashMap<String,Boolean>();

      for(String s : strings)
      { //s "is a member of" strings
        if(mymap.containsKey(s)){
          mymap.put(s,true);
        }
        else{
        mymap.put(s,false);  
        }
      }
    return mymap;
  }
}

// () <> [] {}
// ^  ^   ^  ^ c