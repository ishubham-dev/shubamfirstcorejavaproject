CREATE TABLE Likes_Dislikes (
    user_id INT,
    celebrity_id INT,
    like_dislike ENUM('like','dislike'),
    PRIMARY KEY (user_id, celebrity_id),
    FOREIGN KEY (user_id) REFERENCES USERS(user_id),
    FOREIGN KEY (celebrity_id) REFERENCES Celebrity(celebrity_id)
);
