entity adder is
generic (
    DATA_WIDTH_MAX  : integer := 32
);
port(
    a   :   in  std_logic_vector(DATA_WIDTH_MAX-1 downto 0);
    b   :   in  std_logic_vector(DATA_WIDTH_MAX-1 downto 0);
    o   :   out  std_logic_vector(DATA_WIDTH_MAX-1 downto 0)
);
end adder;

architecture Behavioral of adder is
begin

    o <= std_logic_vector(unsigned(a) + unsigned(b));
       
end Behavioral;
