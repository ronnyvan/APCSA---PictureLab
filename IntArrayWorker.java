public class IntArrayWorker
{
  private int[][] matrix = null;
  
 
  public void setMatrix(int[][] theMatrix)
  {
    matrix = theMatrix;
  }
  
  
  public int getTotal()
  {
    int total = 0;
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; col++)
      {
        total = total + matrix[row][col];
      }
    }
    return total;
  }
  
  
  public int getTotalNested()
  {
    int total = 0;
    for (int[] rowArray : matrix)
    {
      for (int item : rowArray)
      {
        total = total + item;
      }
    }
    return total;
  }
  
  
  public void fillCount()
  {
    int numCols = matrix[0].length;
    int count = 1;
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < numCols; col++)
      {
        matrix[row][col] = count;
        count++;
      }
    }
  }
  

  public void print()
  {
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; col++)
      {
        System.out.print( matrix[row][col] + " " );
      }
      System.out.println();
    }
    System.out.println();
  }
  
  

  public void fillPattern1()
  {
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; 
           col++)
      {
        if (row < col)
          matrix[row][col] = 1;
        else if (row == col)
          matrix[row][col] = 2;
        else
          matrix[row][col] = 3;
      }
    }
  }
 
  public int getCount(int checkNum)
  {
    int count = 0;
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; col++)
      {
        if (matrix[row][col] == checkNum) 
          count++;
      }
    }
    return count;
  }
  
  public int getLargest()
  {
    int max = 0;
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[row].length; col++)
      {
        if (matrix[row][col] > max) 
        {
          max = matrix[row][col];
        }
      }
    }
    return max;
  }
  
  public int getColTotal(int col)
  {
    int count = 0;
    for (int row = 0; row < matrix.length; row++)
    {
      total += matrix[row][col];
    }
    return count;
  }
}
