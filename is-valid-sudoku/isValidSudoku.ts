const isValidSudoku = (board: string[][]) => {
  const cols = new Map();
  const rows = new Map();
  const squares = new Map();
  for (let i = 0; i < 9; i++) {
    cols.set(i, new Set([]));
    rows.set(i, new Set([]));
  }
  for (let i = 0; i < 3; i++) {
    for (let j = 0; j < 3; j++) {
      squares.set(`${i}${j}`, new Set([]));
    }
  }

  for (let r = 0; r < 9; r++) {
    for (let c = 0; c < 9; c++) {
      if (board[r][c] == ".") {
        continue;
      }
      if (
        cols.get(c).has(board[r][c]) ||
        rows.get(r).has(board[r][c]) ||
        squares.get(`${Math.floor(r / 3)}${Math.floor(c / 3)}`).has(board[r][c])
      ) {
        return false;
      }
      if (!cols.get(c)) {
        cols.set(c, new Set([board[r][c]]));
      }
      if (!rows.get(r)) {
        rows.set(r, new Set([board[r][c]]));
      }
      if (!squares.get(`${Math.floor(r / 3)}${Math.floor(c / 3)}`)) {
        squares.set(
          `${Math.floor(r / 3)}${Math.floor(c / 3)}`,
          new Set([board[r][c]])
        );
      }
    }
  }

  return true;
};
