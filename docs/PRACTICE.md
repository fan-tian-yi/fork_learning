# 练习口令

## 安全网：搞坏了怎么救

```bash
git status                     # 第一步永远是它
git reflog                     # 所有 HEAD 移动记录，找回丢失提交的关键
git reset --hard HEAD@{2}      # 回到 reflog 里的某一步
git merge --abort              # 放弃这次合并
git rebase --abort             # 放弃这次变基
```

## 观察类命令（第 1 章重点）

```bash
cat .git/HEAD                          # HEAD 现在指向谁
cat .git/refs/heads/main               # main 这个指针里存的是什么
git rev-parse main                     # 打印 main 指向的 commit sha
git branch -v                          # 每个分支指向哪个 commit
git log --oneline --graph --all        # 看分叉
git cat-file -p HEAD                   # 拆开一个 commit 看内部结构
```

## 当前分支结构

- `main`     —— 主分支
- `dev`      —— 集成分支
- `feature/login` —— 已有的一条功能分支，用来观察分叉
