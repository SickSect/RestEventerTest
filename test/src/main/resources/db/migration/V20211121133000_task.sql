CREATE TABLE task (
    id BIGSERIAL PRIMARY KEY,
    date DATE NOT NULL,
    description TEXT,
    done BOOLEAN NOT NULL DEFAULT FALSE)
CREATE TABLE user
(
    id BIGSERIAL PRIMARY KEY,
    login text,
    password text
)
CREATE INDEX task_date_idx ON task (date);
CREATE INDEX task_done_idx ON task (done);
CREATE INDEX task_user_idx ON user (user);
CREATE INDEX task_pswd_idx ON user (pswd);