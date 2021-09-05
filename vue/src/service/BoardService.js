import http from "../http-common/http-common";

class BoardService {
  getList() {
    return http.get("/axios/list");
  }
}
export default new BoardService();