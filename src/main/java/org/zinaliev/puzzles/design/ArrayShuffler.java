package org.zinaliev.puzzles.design;

import java.util.Random;

/**
 * Shuffle a set of numbers without duplicates.
 * <p>
 * Example:
 * <p>
 * // Init an array with set 1, 2, and 3.
 * int[] nums = {1,2,3};
 * Solution solution = new Solution(nums);
 * <p>
 * // Shuffle the array [1,2,3] and return its result. Any permutation of [1,2,3] must equally likely to be returned.
 * solution.shuffle();
 * <p>
 * // Resets the array back to its original configuration [1,2,3].
 * solution.reset();
 * <p>
 * // Returns the random shuffling of array [1,2,3].
 * solution.shuffle();
 */
public class ArrayShuffler {
  private final Random random = new Random();
  private final int[] original;

  public ArrayShuffler(int[] nums) {
    this.original = nums;
  }

  /**
   * Resets the array to its original configuration and return it.
   */
  public int[] reset() {
    return original;
  }

  /**
   * Returns a random shuffling of the array.
   */
  public int[] shuffle() {

    int[] shuffled = original.clone();

    for (int i = 0; i < original.length; i++) {
      swap(shuffled, i, random.nextInt(original.length));
    }

    return shuffled;
  }

  private void swap(int[] shuffled, int a, int b) {

    shuffled[a] = shuffled[b] ^ shuffled[a];
    shuffled[b] = shuffled[b] ^ shuffled[a];
    shuffled[a] = shuffled[b] ^ shuffled[a];
  }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
