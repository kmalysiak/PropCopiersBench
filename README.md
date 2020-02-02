## Benchmarking common object copiers available in Java<br/>

This project is a  benchmark setup for testing performance of different object properties copiers: jackson, gson, BeanUtils.copyProperties and mapstruct. Below are the results of benchmarks run on my machine .<br/>

**Deep copiers** detailed results from jmh <br/>

| Benchmark | Mode | Cnt | Score   | Error     | Units |
|-----------|------|-----|---------|-----------|-------|
| jackson   | avgt | 3   | 304,657 | ± 95,358  | us/op |
| gson      | avgt | 3   | 645,878 | ± 464,097 | us/op |


<br/>**Shallow copiers** detailed results from jmh <br/>

| Benchmark                | Mode | Cnt | Score  | Error    | Units |
|--------------------------|------|-----|--------|----------|-------|
| maspstruct               | avgt | 3   | 1,368  | ± 1,201  | us/op |
| BeanUtils.copyProperties | avgt | 3   | 62,899 | ± 62,347 | us/op |

<br/><br/>
To sum up, from the tested copiers:
- among deep copiers - **mapstruct is the fastest**. <br/>
- among shallow copiers - **jaxson is the fastest**.<br/>



