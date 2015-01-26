# CLJSJS Testing

This repo contains small Clojurescript files that use CLJSJS packaged
JS dependencies.  All compiled scripts are loaded in index.html to be
able to easily check if externs etc. have been correctly loaded.
(This is smoke testing but better than nothing.)

Build all Clojurescript files with

```
# note that boot-cljs with Clojurescript 0.0-2727 is required for this
boot cljs -O advanced
```

and then run

```
open target/index.html
```

if no errors occur in the console, things are likely to work.
