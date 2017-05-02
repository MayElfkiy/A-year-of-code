--implementing a 1 bit full adder using 2 half adders
library IEEE;
use IEEE.STD_LOGIC_1164.ALL;



entity fullAdder is
    Port ( a : in STD_LOGIC;
           b : in STD_LOGIC;
           Cin : in STD_LOGIC;
           sum : out STD_LOGIC;
           carry : out STD_LOGIC);
end fullAdder;

architecture Behavioral of fullAdder is
component halfAdder
   port(a: in std_logic;
   b: in std_logic;
   sum: out std_logic;
   carry: out std_logic);
   end component;
   signal S1, c1,c2: std_logic;
begin
HA1: halfAdder port map(a,b,s1,c1);
HA2: halfAdder port map(S1,Cin,sum,c2);
 carry <= C1 OR C2;
 
   carry <= c1 or c2; 

end Behavioral;
