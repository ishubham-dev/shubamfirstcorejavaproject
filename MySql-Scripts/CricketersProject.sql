use batch80;
CREATE TABLE players (
    player_id INT PRIMARY KEY,
    player_name VARCHAR(50),
    age INT,
    role VARCHAR(20),
    batting_style VARCHAR(30),
    bowling_style VARCHAR(30),
    matches INT,
    runs INT,
    wickets INT,
    batting_avg DECIMAL(5,2),
    strike_rate DECIMAL(5,2),
    economy DECIMAL(4,2),
    catches INT,
    team VARCHAR(20)
);

select * from players;



INSERT INTO players VALUE
(1, 'Shubman Gill', 28, 'Batsman', 'Right-hand Bat', 'None', 95, 5200, 0, 62.50, 102.40, 0.00, 48, 'India');
INSERT INTO players VALUE
(2, 'Yashasvi Jaiswal', 25, 'Batsman', 'Left-hand Bat', 'Right-arm Legbreak', 55, 2400, 12, 48.00, 98.50, 5.80, 22, 'India');
INSERT INTO players VALUE
(3, 'Virat Kohli', 38, 'Batsman', 'Right-hand Bat', 'Right-arm Medium', 320, 15000, 5, 58.20, 94.60, 6.10, 165, 'India');
INSERT INTO players VALUE
(4, 'Shreyas Iyer', 32, 'Batsman', 'Right-hand Bat', 'Right-arm Offbreak', 90, 3900, 1, 47.50, 101.90, 0.00, 40, 'India');
INSERT INTO players VALUE
(5, 'KL Rahul', 35, 'Wicket-Keeper', 'Right-hand Bat', 'None', 95, 3200, 0, 45.10, 89.70, 0.00, 75, 'India');
INSERT INTO players VALUES
(6, 'Rishabh Pant', 30, 'Wicket-Keeper', 'Left-hand Bat',
'0',
70,
2100,
0,
35.80,
108.20,
0.00,
55,
'India');
INSERT INTO players VALUE
(7, 'Hardik Pandya', 33, 'All-Rounder', 'Right-hand Bat', 'Right-arm Fast-Medium', 100, 2300, 95, 34.80, 112.50, 5.60, 52, 'India');
INSERT INTO players VALUE
(8, 'Axar Patel', 33, 'All-Rounder', 'Left-hand Bat', 'Left-arm Orthodox', 85, 1500, 90, 28.50, 92.30, 4.70, 44, 'India');
INSERT INTO players VALUE
(9, 'Ravindra Jadeja', 38, 'All-Rounder', 'Left-hand Bat', 'Left-arm Orthodox', 210, 2900, 235, 32.90, 86.50, 4.80, 110, 'India');
INSERT INTO players VALUE
(10, 'Washington Sundar', 27, 'All-Rounder', 'Left-hand Bat', 'Right-arm Offbreak', 45, 600, 40, 24.00, 85.00, 4.95, 18, 'India');
INSERT INTO players VALUE
(11, 'Kuldeep Yadav', 32, 'Bowler', 'Left-hand Bat', 'Left-arm Chinaman', 115, 250, 210, 10.50, 75.00, 4.85, 30, 'India');
INSERT INTO players VALUE
(12, 'Jasprit Bumrah', 33, 'Bowler', 'Right-hand Bat', 'Right-arm Fast', 100, 120, 185, 8.20, 68.50, 4.35, 28, 'India');
INSERT INTO players VALUE
(13, 'Mohammed Siraj', 32, 'Bowler', 'Right-hand Bat', 'Right-arm Fast', 90, 150, 155, 9.80, 72.40, 5.10, 24, 'India');
INSERT INTO players VALUE
(14, 'Arshdeep Singh', 28, 'Bowler', 'Left-hand Bat', 'Left-arm Fast-Medium', 55, 80, 90, 8.00, 70.00, 5.30, 16, 'India');
INSERT INTO players VALUE
(15, 'Mohammed Shami', 37, 'Bowler', 'Right-hand Bat', 'Right-arm Fast', 110, 220, 205, 11.00, 78.00, 5.55, 25, 'India');