package algo.structures;

public class BitSet {

  // 2^WORD_SIZE = 32
  private static final int WORD_SIZE = 5;
  private static final int BIT_MASK = 0x1F;
  private int[] bitSet;

  public BitSet(int size) {
    // size / 32
    bitSet = new int[(size >> WORD_SIZE) + 1];
  }

  public boolean get(int pos) {
    int wordIndex = (pos >> WORD_SIZE);
    int bitIndex = (pos & BIT_MASK);
    return (bitSet[wordIndex] & (1 << bitIndex)) != 0;
  }

  public void set(int pos) {
    int wordIndex = (pos >> WORD_SIZE);
    int bitIndex = (pos & BIT_MASK);
    bitSet[wordIndex] |= 1 << bitIndex;
  }
}
