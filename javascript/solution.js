function possibleBonus(positionA, positionB){
  let val = positionB - positionA
  return val > 0 && val <= 6
}

possibleBonus(3,7)
possibleBonus(1,9)
possibleBonus(5,3)
