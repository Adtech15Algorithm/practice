# 問題
n 時 m 分のアナログ時計があります。短針と長針のなす角度のうち小さい方を度数法で求めてください。

http://abc030.contest.atcoder.jp/tasks/abc030_b

# 解説
時針の角度と分針の角度を別々に計算して、そのあとにこれらのなす角を計算する。



## 分針

```
分針の角度 = m / 60 * 360
```

## 時針
* 24時間表記で渡されるので、12時間表記に変換する

```
h = n % 12
時針の角度 = h / 12 * 360 + m / 60 * 30;
```

## 🍆なす角の計算🍆

```
なす角 = |360 - degree|
```

問題文に小さい方の角度を返すと書いてあるので、180度より大きい場合は360から引く
