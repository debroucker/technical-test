import http from "@/http-common";

class ArticleService {
    getAll(): Promise<any> {
        return http.get("/article");
    }
    save(data: any) {
        return http.post("/article");
    }
}

export default new ArticleService();