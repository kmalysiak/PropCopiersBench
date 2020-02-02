Below are the results of Benchmark run on my machine.<br/>
Among deep copiers - **mapstruct is the fastest**. <br/>
Among shallow copiers - **jaxson is the fastest**.<br/>
Benchmark Mode Cnt Score Error Units <br/>

**Deep copiers** <br/>

| Benchmark | Mode | Cnt | Score   | Error     | Units |
|-----------|------|-----|---------|-----------|-------|
| jackson   | avgt | 3   | 304,657 | ± 95,358  | us/op |
| gson      | avgt | 3   | 645,878 | ± 464,097 | us/op |


**Shallow copiers** <br/>

| Benchmark                | Mode | Cnt | Score  | Error    | Units |
|--------------------------|------|-----|--------|----------|-------|
| maspstruct               | avgt | 3   | 1,368  | ± 1,201  | us/op |
| BeanUtils.copyProperties | avgt | 3   | 62,899 | ± 62,347 | us/op |




