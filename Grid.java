public class Grid{
  
  private char[][] grid; 

  public Grid(){

    grid = new char[3][3];

    for(int row = 0; row < 3; row++)
      {
        for(int col = 0; col < 3; col++)
          {
            grid[row][col] = ' '; 
          }
      }
  }
  public void set(int row, int col, char p)
  {
     grid[row][col] = p; 

  }
  public char get(int row, int col)
  {
     return grid[row][col]; 

  }

  public void print()
  {
    for(int row = 0; row < 3; row++)
      {
        for(int col = 0; col < 3; col++)
          {
            System.out.print("[" + grid[row][col] + "]"); 
          }

        System.out.println();
    
  }
  }

  boolean isWinner(char p){
//row
    for(int row = 0; row < 3; row++)
      {
        if(grid[row][0] == p &&  grid[row][1] == p &&  grid[row][2] == p)
        {
          return true;
        }   
       
      }
//colunm
    for(int col = 0; col < 3; col++)
        {
          if(grid[0][col] == p && grid[1][col] == p && grid[2][col] == p)

          {
            return true;  
          }

    
        }

    if(grid[0][0] == p && grid[1][1] == p && grid[2][2] == p) return true;
    if(grid[0][2] == p && grid[1][1] == p && grid[2][0] == p) return true;

return false;
    
    
  }

  boolean isTied(){
    if(isWinner('x') || isWinner('o')) return false;

    for(int row = 0; row < 3; row++)
    {
      for(int col = 0; col < 3; col++)
        {
          if(grid[row][col] == ' ') return false; 
        }
    }

    return true;

         
  }
}

