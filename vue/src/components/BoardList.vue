<template>
  <div class="container">
    <table class="table table-hover">
      <thead>
        <tr>
          <th>번호</th>
          <th>이름</th>
          <th>제목</th>
          <th>날짜</th>
          <th>히트</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="board in boards" :key="board.bid">
        	<td>{{board.bid}}</td>
            <td>{{board.bname}}</td>

			<td><a :href="'/content_view?bid=' + board.bid">{{board.btitle}}</a></td> 

        	<td>{{board.bdate}}</td>
        </tr>
      </tbody>
    </table>
    <hr />

    <div class="text-right">
      <a class="btn btn-primary" href="write_view">글작성</a>
    </div>

    <div class="text-center">
      <ul class="pagination justify-content-center">
        <li class="page-item">
          <a class="page-link" href>이전</a>
        </li>
        <li class="page-item">
          <a class="page-link" href>1</a>
        </li>
        <li class="page-item">
          <a class="page-link" href>2</a>
        </li>
        <li class="page-item">
          <a class="page-link" href>3</a>
        </li>
      </ul>
    </div>
  </div>
</template>

<script>
import BoardService from "../service/BoardService";

export default {
  name: "board-list",
  data() {
    return {
	  boards: [],
    };
  },
  methods: {
    getList() {
      BoardService.getList()
        .then(response => {
          this.boards = response.data;
          console.log(this.boards);
        })
        .catch(e => {
          console.log(e);
        });
    }
  },
  mounted() {
    this.getList();
  }
};
</script>

