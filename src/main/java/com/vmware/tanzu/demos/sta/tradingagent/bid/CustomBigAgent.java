/*
package com.vmware.tanzu.demos.sta.tradingagent.bid;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
@ConditionalOnProperty(name = "app.agent.strategy", havingValue = "custom")
public class CustomBigAgent implements BidAgent {

    private static final BigDecimal BUY_GOOGLE_THRESHOLD = new BigDecimal(130);
    private static final BigDecimal SELL_GOOGLE_THRESHOLD = new BigDecimal(140);


    @Override
    public List<BidAgentRequest> execute(Context ctx) {
        final List<Stock> sortedStocks = new ArrayList<>(ctx.stocks());

        return null;
    }
    public void buyGoogleStock(){

        final BidController.UserBidRequest userReq = new BidController.UserBidRequest(user, agentReq.symbol(), agentReq.shares()); client.postForLocation("/api/v1/bids", userReq); out.println("Placing bid: " + agentReq);


    }
    public void sellGoogleStock(){

    }
    public void tradeGoogle(Stock stock){

        BigDecimal diff = BUY_GOOGLE_THRESHOLD.subtract(stock.price());

        if( diff.compareTo(BigDecimal.ZERO) > 0) {
            int quantityToBuy = random.nextInt(10) + 1; // Buy between 1 to 10 shares
            portfolio.buyStock(stock, quantityToBuy);
        } else if (diff.compareTo(BigDecimal.ZERO) < 0)) {
            portfolio.sellAllStock(stock);

        })
    }


}
*/
