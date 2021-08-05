import java.util.*; //arrayList,COllections,Random


class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    int[] nums = {123,52,12,53,65,1,2,68,53};

int[] myArray = evenOdd(nums);
for(int i : myArray){
    System.out.println(i);
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
}