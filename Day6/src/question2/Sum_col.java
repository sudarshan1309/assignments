package question2;

public class Sum_col {
    public static void main(String[] args) {
        int[][] matrix={
        		
                {1,2,3},            
                {4,5,6},            
                {7,8,9}                 
        };
        //System.out.println(matrix[0][2]); //IOB
        for(int col=0;col<matrix.length;col++){
        	int ans = 0;
            for(int row=0;row<matrix.length;row++ ){
            	if(matrix[row][col]%2==0) {
            		ans+=matrix[row][col];	
            	}
            }
            System.out.println(ans);
        }
      

    }
}
