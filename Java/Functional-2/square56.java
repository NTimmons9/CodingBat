public List<Integer> square56(List<Integer> nums) {
  List<Integer> results = new ArrayList<>();
  int currentNum = 0;
  for(int i = 0; i < nums.size(); i++){
    currentNum = nums.get(i);
    if(!(((currentNum * currentNum - 5) % 10 == 0) || ((currentNum * currentNum - 6) % 10 == 0))){
      results.add(currentNum*currentNum + 10);
    }
  }
  
  return results;
}
