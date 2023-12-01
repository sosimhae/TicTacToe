import java.util.Scanner;

class Main {
  public static void main(String[] args) {  

    System.out.println("Hello, this is TicTacToe game");

    Scanner sc = new Scanner(System.in);

    String numOfPlayer; 

    char firstPlayer = 'o';
    char secondPlayer = 'x';

    int fPlayer = 0;
    int sPlayer = 0; 

    int row = 0;
    int col = 0;

    boolean playAgain = true;
    
    while (playAgain) {
    

    while(true)
      {
        System.out.println("Player 1 or Player 2"); 
        numOfPlayer  = sc.next();

        if(numOfPlayer.equals("1"))
        {
          break;
        }

        else if(numOfPlayer.equals("2"))
        {
          break;
        }

        else
        {
          System.out.println("Invalid Input");
          continue;
        }      
        
      }
    

    

    Grid g = new Grid(); 

    g.print();

   

          while(true)
            {
                System.out.println("Please enter the row");
                row = sc.nextInt();

                if(row > 2 || row < 0)
                {
                  System.out.println("Please write between 0 and 2");
                  continue; 
                }

              break; 
      
            }

          while(true)
            {
                System.out.println("Please enter the colunm");
                col = sc.nextInt();

              
                if(row > 2 || row < 0)

                {
                  System.out.println("Please write between 0 and 2");
                  continue;
                }
      

            break;
      }


      if(g.get(row, col) != ' ')
      {
        System.out.println("Not avaliable");
      }

      g.set(row, col, firstPlayer);
      g.print();

      if(g.isWinner(firstPlayer))
      {
        System.out.println(firstPlayer + " is the winner"); 

        if(firstPlayer == 'o')
        {
          fPlayer++;
          System.out.println("Player " + firstPlayer +  ": "  + fPlayer);
          System.out.println("Player " + secondPlayer +  ": "  + sPlayer);
        }
        else
        {
          sPlayer++;
          System.out.println("Player " + "o" +  ": "  + fPlayer);
          System.out.println("Player " + secondPlayer +  ": "  + sPlayer);
        }
    
          if(fPlayer > sPlayer)
          {
            System.out.println(firstPlayer + " is winner!");
          }
          else
          {
            System.out.println(secondPlayer + " is winner!");
          }
          System.out.println("See you again!");
          break; 

        
      }

    if(g.isTied(firstPlayer))
    {
      System.out.println("Tied"); 
      System.out.println("Player " + firstPlayer +  ": "  + fPlayer);
      System.out.println("Player " + secondPlayer +  ": "  + sPlayer);
      System.out.println("See you again!");  
      continue;
    }

    System.out.println("Play again?");
    String ans = sc.next();
      
      if(ans.equals("yes"))
      {
        continue;
      }

      else{
        playAgain = false;
      }
      
      
    }
    }
    

  }


