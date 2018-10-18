package org.zinaliev.puzzles.math;

/**
 * Original task:
 *
 * Following code tries to figure out if a number is prime ( Wiki )
 * However, it has a bug in it.
 * Please correct the bug and then submit the code.
 */
public class IsPrimeNumber {


  public boolean isPrime(int a){

    if(a < 2)
      return false;

    int upperLimit = (int) Math.sqrt(a);

    for(int i = 2; i <= upperLimit; i++) {

      if(i < a && a % i == 0)
        return false;

    }

    return true;
  }
}
