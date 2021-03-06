## 問題リンク

http://abc028.contest.atcoder.jp/tasks/abc028_b

## 問題概要

文字列*S*が与えられる。この文字列は、
`A`, `B`, `C`, `D`, `E`, `F`
の6つからなることがわかっている。

この6種類の文字それぞれについて、出現回数を数えよ。

## 入力形式
```
S
```
文字列*S*が1行にわたって与えられる。

## 出力形式

`A`, `B`, `C`, `D`, `E`, `F` それぞれの出現回数を、スペース区切りでこの順に出力せよ。ただし、行末にはスペースを入れず、改行をすること。

## 制約条件

```
 1<= |S| <= 100
{'A', 'B', 'C', 'D', 'E', 'F'}  ∋ S_i
1 <= i <= |S|
```
すなわち*S*の文字列長は1以上100以下で、その文字列は
`A`, `B`, `C`, `D`, `E`, `F`
からなるということ。

## ジャンル

やるだけ、データ構造: 配列

## 解法

各文字の出現回数を数えるための、長さ6の配列を用意しておく。
文字列*S*を先頭から順番に見て行って、対応する配列の値をインクリメントするだけ。

## 計算量見積もり
*O(|S|)*
