/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.image.datauri;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author saulo
 */
public class DataURITest extends javax.swing.JFrame {

    /**
     * Creates new form DataURITest
     */
    public DataURITest() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");

        jButton1.setText("GERAR IMAGEM");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(281, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 241, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            String imgBase64 = "iVBORw0KGgoAAAANSUhEUgAAAKoAAAEyCAYAAABqNEsYAAAswUlEQVR42u2dB3gVxRbHN6QDgRBICB3pHSRFkN6rCI9eVHovSqRKlSZKR5AiRSwg0hEQARVREEHKQ56CgIJgoSQhJIEQ4Lw5u3uTm3B3d+7e3Xt3787/+873fEqyuzM/zsycOXOG45isoiBiA4jtIXadWBoxIJZE7H/EdhEbTqwgayomT6kUsV9EMJUsgVhf1mRMnvCktJDa20jWdEzuVE8VkKI9IVaHNR+Tu3RAJahoZ4j5siZk0ls+4mIJXLB2rBmZ9FYJFyFF2+eGv0ylidUn1pRYtDivZrKQamsAajqxMI3fy4/Yf4htJRbv4JkYOttErBzrQmuoqQaggrgg00rdiV2mfG4ysSasG71fL2oE6loN3iWE2DYVz75NLD/rSu9WT41APefie+QjdsqF549jXendGqgRqI+I5Vb5DhjeOuzi8w+yrvRujdIIVLQGKt9hggbPvs660rgKEuGIE4GrK4ZynFGchqC+ruIbnuUyk19csRsMB+OpJLGFxBIddNhPxCo48bvGagjqJyq+5aBGz/6NYWEcYWxxKrFUhU7DuGMlD3jU/zr5PXU1fPYehocxlJfYISc67ndieSh+72ANYcEh3N+Jbzqg4bNnMkSM4UkPqei8FRS/u5eGsKBVpvymspyQfaXVc1sxTDwvtfPIxxTgtNAY1K6U3zRTw2fiXD2AYeJZ5eQc73XT2mcKv7+KxqDSDME5iF3T8JkfMUw8r84udiIOrzVkfn+oxqB+6eZFFIijApOHtViDjtyh8IybGkKTIHpMOb2j4fPwCI0Pw8Tz2qFBZz5RmKt+q7GHUwqNXdDwWUMZIsaQVgHxNTLPeE9jUPvIPKu8xouo3AwRY2ivRp36gFghiWf00RjUlTLfM1zD5yxgeBhHazXs2DkSz6ikMaiXdZ7K2EJvpRkextF4jYfKMIlwUSKnf+DfT8Pn7GJoGEuNNAZotsRzvtT4OZMcPKO2hr+/C0PDWMLjGY807GA8YxTh4DlvagzqVe7p8/5TNJxvhzA0jKfTGkM038Ez2mj8DEf774c1+r27GRLGlNbeDtMEi2R7Rn5xgaLlc45xmcF4DCOlafR7hzMkjKkoHbzdZjd4brTO4u9ureHvjDFLxwWLK0iryEec82kNUetsz5mvwzPwiEhBDX83euVAs3QcpnQd4YTiCVbROzpAhAfiwnWep6JhLu05jX7XWbN13GpO2MP+gNO+nIwRVVkniPbazSNxJf1Qp+dY9shJN7uX/4dYBwvAekqnzrePrR41OKirzdZpjqrQbeCEs0Xeqld1BGCU+IxZBgd1jhkXGEkSgea6XgoqhpDu6wQAhqZGc0LBMSODOsOMHfcjJ10GcRrnnZWQP9YZhDUGn6dOM2OnradYbUZ4GagNDO7x2NDvQOMoQzDPe1lM9WcLg7rKjJ3W0YkgsTdtu/WzMKhbzdhhzp5m/JDzjtrvuDPzt0VBPWHGDiuj4kMxFlnMC2CdalFQE83YWbk59fvPsSYHFXfj7loUVlPexZrMqU9162ZyWGdZFNSWZuysyy588BOzxuXsNgCSLAjqRDN2lhZ70+9z5k0bnGlBUHeasaO+0OjjsVanGfMEcJ7+l8VAvc2ZsIzPZg0bAC+gLWJCWAda0KtWNFsnrdW4Af7ghLIzZhLmNPzXYqAOMBuoi3VohDuccAbdTML3fWwhUNezxUTm+Xez1d1caSFQfzUbqON1bAzMEehqorbAyyWuWwRUDC3mMxOow3RuEBxO+5uoPV60kFdtZiZQX3HT396RJmqT9ywC6htmArWHGxtmqknaBDPEzrLAv7HU2c2N85ZJ2qUqp3zDn9ntsplAbe+BBppnkp2RTpy2l44ZzbDKoWnul2rjoUZaaJL2me3lXtU0Vaebe7CRzABrDnEu562gmiavuJGHG8oMsGLiyg9eCqppNmXqGKCxzHA7B54I8MZ8gHZmATXWIA32jgnaCmsc/Mo8qmcUZaBGM2q5Gbz4txaxIZx291YZxRqaBdRogzXceAO0CR6nbswJZ6qOc9peVmE0K89AVW+jPdAOmJOKh97wSvBkzhpbqJiHEcRAdS03wF2JvfnEKYcVC1JcNdPOVIyBd0266/jduTih9la8BQG12SYGqjb2UNw501p4d8GfFgbUZiMZqNre6aRlYeGxnHfv37t63yqLo7pgWC+pugbfOoHBmWEXOJMp1iQNi0dESrjwnU2YJ81i0xmo+tkvxAqo+EZMKTzH4Mwy9zdd/YXnTdbIeO9Abie/sQ6D86l7Bkyn+iZsaLzUy5laV+MZnFmOsZuxmg0fqjFjgztzsddSBmiGDeJMqlYmbvRxlN/4FgOUt484E6udiRseV/G9KL5xAIOUny4FmhnUjibvAKzG0ljhG0tZHFK8JMSfM7m6eUFHYFE2pXS1oxYEFEecWZwJa6E6Ui8v6ZRLCjHWzhaDNIEz0TETGvX1os45wkmfU0evcsiF342X/WJa3B/idMPI7fAbsXKcl2mQl3mStTLfGs7RXS+JKYZ46nQuJxShyL51m0MEAdvuOwP+ZS3AeaFGeOGwN0rme/H805viVMH25++JwOEBQ6zmF+pkG1YQ47rpHv5u/IZcnJdqrBeCih6RJo8VoQ3RsC1xQbfNQ9/8p7d6Upu89apFvJXPU/mWrTnX7u/y+lqnajTHi1e+uKgI81C7BnPCWawHbvjOHZwFtMjLwzR4/5WvB9sXpwP7dP7GWlYA1QoXLMw2QDs34vSpX3WGs4g+sMgOTWeDtDcmqq/gtDv9Ot0qoG7mrLFTc48z1mE2nI5UE/8CTSP2rcrvamAVUHdz1tlWxANtRr6vFZNrnL2XNZ9VQD3IWWsPHIvy5jBwf2Cm17+U3/IPZyF9ZzFQzXBtTVOO7sTseSuBesaCoD42QYD8E45uX98yumxBUG3DZiED90tFTvkS4Z1WAvVfi4KK9rWHNwOUdJhTnynmdUq1MKgghoaMqpEK777EKpD6WhxSo89XiygsqhZbBdS8DFTecPpT2KB9dELmvZdaBdQiDFLDz1ffY6AKmekM0kybZMA+Gijzvu9aBdQYBmcWw6MktQ3WR3LVFpdbBdTGDM6n7AqxPAbqo2CZBdUqq4DajoHp0DYYrJ9uSbznOquA+jKDUtJ6GKifpO5g/dgqoI5kQMreG1DSIP20X+IdP7MKqFMYkIrn5I0Qslon8X67rALqfAajok02QD8tlni3L6wC6hoGIlXIKsrD/fS21UHdanRQ/H18II+fH4QHBEBhYgX90fyhAPl3Ib6+4OOe98AEZU9ebjtD4r32WQXUQ0aC0o9AGR4UCIWDg6FWWBgMLFkSVlStBrujouFY7HNwOoZYzRg4XSMKDleuCtvKlIe3ixSHrqFhUDYwEAoSeHPlyKHX+83yYD9NkninvVYB9SdPwxlM4IrMGQz1C0XCO7HRcLJta7jbpTPc/U8HuPtiO0hs0wYSW7SExKbNILFhY0io2wASateFhNjnISGqFsQ/GwPx1aIgvvKzcKN8VVhXuDg8H5wLInz9tPa2OAV4zkP9JFUfbI9VQPVIdr8P8ZwROXNClQL5YXnTRvDvoL5wb1A/uNevNyS90guSenbLhLUdgbU1gbV5C0hs0hQSGjSChDr1IaFWHUiIqQ0JNZ+D+OrREF+1JsRXqgHxFapBfLmqcO6Z8tAtJBQKEGA1fHe8kC3YA/00WeJ9PrcKqHfcCygHEblyQecqFeHc0P6QMv41SH59JCS/OhSShw+Ce4MJrP1FWHsQWDt3grsd2sPdF16AxFatIbFZc0hs1AQS6tl51eisXjW+QnWIJ541vmwVuFOmMhwvVhqqBQRpOSWY54F+mmnl8JQP58Z6nuG5c0HriuXgl3EjIXX2JEiZMRFSpo6DlDfiIHnsKEh+bVgmrP1egaSXe0JS965wt1NHMgV4MXMK0KSZA68aK3jVKgTUiggqetUqEE9AvVO6Etx6piIMyZMP8uXw1SrRuq6b++odiXfZaAVQQ90BaK7AAKhSOBLOvDEa7i+eDamLZkHq/BmQ+vY0AdjpEyBl0usE1lczYcVpQN+XIalXD7jb1TYFkPGqUWT4rxHz1PDPe1UC6h0C6p2SFWBZgUjIrw2sF9wcBVjCWTgppazuXjQkN0x6oQWkrJoP91cvgPv4v++9A/ffnQupCO28NyF1zhRIedMG6yh+GnBv6AC4N6APJPUWpwDoVdvbe1UyV63fEBKerwcJz9mG/1jJ4f9OKQHUOyXKw/L8kRCmDazujAJIFQd+xwqg1tIL0ABfXygXGQFnZr0BDzYsgwcfLRfsQ/LP65fC/fcXCcAumUO8qwjr9PGQMpFMA14fAckjBwtTgL5kCvCS6FVtc9WWrfgIQAJGACiGfwFU9KoCqGhDQvJpMWfFadOzbuorqaSU0VYAta0ekIYEBUGLqhUhYc0iSNu0EtK2vA9p29YKtmUNpH26Ch58TKBdtwTur5gnwIqedRaZBkwZC8njXhW86rCBglfFhRXOVTv+R4wA2A3/tlCV/eq/Sk2H81R7UG8VLwc1yAJLg+/Fm671zgXIzwml3h09v6sVQO2tNaR5g4NgQIPnee+Ztnk1pO1YDw/3fAQP930CD78gtvdjSNu1gQf2wSfvEVgX856Vn7fOnSpMAXBxFUe86gicq/aFpD4vCeGqznbDP4aqGpPhv15D5XlqBqgVM0C9Q0A9WfgZCJeYAhQrVgw++OAD2Lt3L4SHh7tysYUWkkvFtEQB3zgtIc1DIB3RtD48+OBd3mum7fyAwLkRHh76DNIPbxPs6y3w8MtN8HD3hwKsBOj7qxeSOetbmV518hhhrjpqCBn++wvDPy6qunQioLaHxLZtHc9TMfjPgxqVbUFlB2rJTFDROubKI7kpcPbsWUAhsArfnkLsGR376XtOuuZriBVAna3Zyj4gALpE1yBzz4VkWH+PH+bRiyKY6Ud3Qfqpg/DozNeQ/sPnPLAP92/iQcapAT8FWP42pC6cSeaqk/mQVcbwj4sq3ATIMk9tK8xTbWGqLAsqMZ4qs/K3B/Un9Kq+jr3q5MmTeVCfPHkCjRo1UmoDvbYyG3HyR2YsoVVaQJrDxweiihWBFLKSf7B2sTAvRW/65aeQ/t0OeHTuCDy+9is8vnEJHl04AenHdvNe9uHnH0HaZ+/zHhjnqvzw/xYZ/qeNFzYCXhsmgIobABhT7dZFCFPZL6gyQK2TbeUvglpeHlS08v4BDr+revXqYNOFCxcgKEhxTttN4/7BGwjlLm9bbxVQNcmcKpQnBP6YPo73iugd+WGfzEMfHtzMe9NHF3+CJ4m34Mn9ZHh89RdIP/EF8bRbhfkqDv8blsH9lfOFcBXOU3H1P2G0ACouqLQCtZRjUMflDXM4/OfIkQMSExMzYEUPyykXXQvVsH/mKjyvl1VAPewqpHmDAmFVpxcgdcEMEVTRo+4iHvUAetSd8Oj8UXj812V4fPMaPPrttDD8f7WFX2TxHnWDA4864TW3gXqgYDHJuOr+/fszQL1//z6ULl1aqU20KrHzCqd89XsBq4B63lVQq0VG8AsgXAhhEP/BmkVkNb8C0rav41f56d9s5cHE4f/R+e8h/eR+SP92Oz8t4Ff/GKpav0RY+fNz1CnCtioO/bY5KoL6EgE1eyy1iSNQY7KCWk556L9atDQUlEhcWbx4Mdhr586dNDcGuloXoCexhwrP2chZSC4lpIQGBsLenl34PXvcDsV4KO48oYdM+2y1MPyTRRMO8+lHdgiGC6kDmwVvunUtv/Dig/+4UzXfLpZqW/UP6S/s+/OrfhHULKv+bIsph6t+eVDvFCsLhSVAHTFiBGRX8+bNldrmJjE/Ff2BPzONo6s0XccqkAZQNoikPZM3Lz9E41CNnhA9Ij/8o1fFlT8G9xFWjKESYPmwFMZSP/+Qjwo82LhS8KYY9Mf5KYGdT1R543Vhd2rEYH7PP6nPy5DUs7uQSWW/jdpYDE+pjKPaIEV7xs/f4Tf27NnzKVD/97//gb+/v1L7YGGznE70R01iRynb/jMredOinIv5pONio3jPh3HPlJlvQOo703ngcBjH1T/uPvFBf9yR2rFeMDIl4OelZHrAb6Xi3v/StwRvOnty5rBvm59m35l6UdyZwoB/lsSU2iKodjtTToBayT/Q4Xd269YNHGnUqFE07XSNWHdigRJ9gBdeYLnLzU44DbyCqISVQI12BdTw4GD4sXtnSB49nF+hp0wbx4PGz1VxCoCwomf94F1hjx/B3LiC97T83j8BGVf6fKCfLMRS3xITU3hvOhKSR9oN+y/1EOantoVUK1xINXdprz87qFUlQO3cubNDUBMSEmh2rOzrA2CEBfNYp4r/i5n5t1S0/QjOYmrjCqiFc+UkIA3g55HJY0by254YVsKAPQ8retZlc4VhffVCAVpiuCHAA0qmCPwePw/pVGHIxx0p+33+gX0hqXe27VP7+ankit8GquPsKUegVg8IpB76bVqxYoW7T0Yc54x97ZAu6uNKo5Uj81MECYHis/NxCkC8IQ/r7ElCrilCiMAuncN7Tlww4TDPz0dxhU+mCkKKnwApP+QTD83v8dtlTmWEpdpJDfsU+ailpBdSaDUkQH3ttdckQU1PT4eKFSu6E9TGnAU10ZVGa1wokgcJFzuY6Jz86jAR1jhhnomRAJwKzJ0qAIn7+Gj4zwgxLr7IvJaPmWIeKnpSHtLBwpCf5TiKnTdt2TIzfuro3JQz81OKxdTMmTNBThThKq1sL2dRLXal4doXL8YH4XEOid5PgHUoP79Ez4jw8cBi9j5Ci4stBBMN56IIKHrRiaMzj6HYIOUTpl8SVvpd7GKnWbwprvYlkqafGvbl56dohSTCU5iQoqTGjRu7A9QGVgV1kysN171kCd7bodfjYcWjIzgNIIsgHroxIrAERH5KgOBOGiP878Q4YZhHQOOIFx1lO9gnelKEtFf3zCMo9kemm0h4UxeG/ZOFSkomppw+fVoR1OPHj/NREB0h/YmzsL52pfFaFSrEp93xsKJn7fsymbP2ETwielcEFj0sDueYW4ored5GCHAizLgQw/ko7j7hcWlc4ePREwIpv8rnw1G2IV9Y6Sc2apw5N83uTSUO9jlK77MHdUm+CL4aS/Zv9PPzgwcPHgCNunbtqieoQ60M6m+uNF50vnyCt+vciY9x8ose4gkxJY9fZKF3RAAR2hGD+GE9w9B74qoeoUZA0YtiUB/383GFbwcpvwuF4SjM6G/cJDP/NIs3zXam34nVPlq9wGCH3xgTEwO0unTpEgQEBOgBKe7ph1kZVJcuQSuZMye/Cufnj5068itzhIyHDYHFhVb/3oKXtRWX4K2vADKZh/IeFAF9RfSiGNTH3SfbcG+D1JbNnzHk2wX47c/zS3pT6WH/r6JlJPf5J02aBM5o+PDhet3UYlkVcLUBCwYGwj9kOMZFDq7IM7wrAovTgV49BGgRQpxz9rEz/P/479EL9xQB7SJ6UQS/nTgnbWnzpCKkdetnKzoRm7nSzz43tXlTR4soO1CX5SsIuXwcH/I7fPiwU6D+/fffkJP8BdYY1AlWBrWmqw0Y5u8PXzz3nHDOnng+3ru2by8C25EHj4cWpwUIbk/R8J97dBViozjEowe1AUq8aMbqHsNQjiAV56UZu1AZQ7640nfCm6JJJU0XLlwYHj16BM5qzJgxWoNa08qgDtSiEfsXLUpgaiF4PgLXXRuwOLfsIEKLEOKZfHvDf4f/Df8MeuN2IqDoRW1DPRZEwzBUfXG4zwKpuMp/asiXWOlLgLo9vAiESRyZnjBhAqjR7du3IU+ePFpBetOKO1H2WqlFQ5YICuJh4qFqngksAsdDi9MCHlwRXt7aCf+u3QsCnDgP5T0o+dkWLYSVPXpR3MfHWGmdeuKc1AGktlX+U0O+8kr/tow3xVATHj1RqylTpmgF6jbO4jqsRUOG+fnBgRo1eahwRc4Di8M1xjsRvFYiuLy1sbPWwpSBh7NlpgclgPJlJXFlj+f1bav7WLvh3hGk4irf4ZAvAerCfBGQV8KbdujQAVwRHl8JCwvTAtTZVgf1D63mUM3zhQlDM3o/MpfkPSwC16SZ4B0RXATR3pqJ/x7hbNJUGOKzA8oP9WIISglS+3kpxZB/oXApyZU+etOTJ0+Cq5o9e7YW7dvb6qCmagVqOFlUnawRJWxnIrAIWn0BWt7ToiG8WayxACb+GfyzGMDHn7UH1OZF+RCUbeFkNyeVglRhlX+LWHRAEOSQ2homC0ItlJycDBEREa62b20rQ6r5bdL1QvIICx0cphE0hPZ5G7givGj1GmT+M/63OvUy4cSfxd8RWzsD0CxeFFf3eA5KCVLbvFQC1MEhoZI1p4KDg+H3338HrTRnzhxX2za/lUHtqTWooWQYXVeqrDBMI2joDdEr1rJZXRHgusI/17KBaYPz+cwh3h5QmxfFob6SEqTKQ/6CsAjZ+qgzZswALXXv3j0oUKCAKztSltYGPfajI8kU4JeqNQTQomoJ0CF8chZdKyucz2YHNLsXzVzdOwvp8vwFZUtNPvfcc/Dw4UPQWtOmTVPbpvFsIaWi4XC+9emnn0KJEiUcL0KIlQ0Mgj+r1RRge1YADwHEkFJWi80EE7dAbXDahnj0oBmAZvOithBUluFeHtJ5ZIUvB2nu3Lnh4sWLoIcwAhAaGqoG1OtWhjSCU3HyFM8N3bp1i2/4DRs2yN4HVTNnTriOCx6EDg0BlDLbn+HhrCkslOyH+AxA7b2oxMLJAaS4cBpI5qShMpBiNZTt27eDnpo4caIaUC9aGdSuTs09iSdYuXJllkbHgmEtWrSQvSeqEvGslypUFcCrYjMRRtv/r/xsJpg2OO2HeHtAn/Ki2YZ6B5D+WrgURJHVfYhCsd5FixaB3sLdKvTaToJ6xsqgfkLbUK1atYLr1687bPg//vhDdpswB+cDRcicdX/JspkAOrIK9p7TDk5xiOfLRWYASjHUi5AuJoumghR3TI0fPx7cpbi4ODU3BVpSeLb8Lk0j4cJCSfv27QNfX/k6+PkJLK+EhsF1hK58tWxW1Q5MezjFIV4JUAeQflmwGFTxD5TccbK3cePGgTv1119/QWBgoDOg/mNVUFvRNtLo0aOpGn/u3LlU95gW9vOH6eGR8DfxkFmAtAMzC5z2QzwFoDsjikI0mW7Q3HaCc1J8b0+oX79+LDylZSLKxo0bqRufBlY+mO6TAyL9/KBXnnxwpHhpEUp7MEU45QC1gxTLmsflyQ8lyF8C2rujcJ6o98JJTr/++iv/F8UJWEOsBqmvOJRQNdCVK1ec6gBckChNA+zDWAXIny1CAGudKwTm5Y+Er4s8A1dKlBXAdADnxWJl4FBkcZhH5p5tc+aGYuRnw8m0wpejP1BXo0YNvmaUp9WuXTtnQC3Bhn2pvfvwcFUdgHNWNRlDvmRqkJ+AixfsRhIrTiBEL4n/W4T8f6yyV5D8d4yD+qo46Yl/gTC3NC0tDYygI0eOOPP+Ta0GKnVl6TZt2qjuhBs3bvDRAo7jDGENGzaEU6dOgdFUu3Zt2m8YbSVIC3LKRWEzDLf8XNWWLVugVKlSHgO0WrVqsG3bNjCqtm7dSvstH1gJ1LHOdDLeq6SF8Dz8qlWroFy5cm67Vh1vLsH3x00JI+vx48dQtmxZ2ivXLSE8b3PBmc62bZVq2SlffPEF9OjRQ48TmlCmTBmYOnUqf67eTFq+fDnN9z3ipGurepU6ONvpeio1NZVfdL366qv8PI3iOhyHp0NfeOEFWLJkiUvnmjytlJQU2sVnFyuAetQZCNDruVOYVodZSzhcY07BrFmz+B0jm+F1OfPmzYOPPvoIvvvuO/j333/Bm4QbKxT9cszbIW3irLdauHAhMLlPeJqAIv6Mw3+AN4N6wFlQjx49yuhxs3AaQ9E347wV0gbOQoq3fOAcksm9+vLLL2n656Q3QurDCVfHOAVqVFQUo8ZDqlKliiVPpPZSE+YZMmQII8ZDWrZsGU0ffexNkAZzKs9ErV27lhHjIeFp1bx589Kk/YV7C6gz1QbOz58/z4jxoIYNG0bTT695A6TliT1QA2lISAi/g8TkOZ09e5Z2S9XH7AuoI2q9Kd7qweR5xcbG0vSXqS/rHebKfrk7D7kxSWv16tU0/bXerJCW5oSLXFWDauSUOCsJC6tRFAHGAnf5zAYp3u/+g6sZSFLHopncr0GDBtH02TCzgTrNVUgLFSrE6DCQsDYrRb+dNds26SNXQXW1ujKT9qpZsyZN38WaAVKsIXVDi8RjrIzMZCy99957NH33rhmy9vdrlSF/6NAhRobBhBUAsagwp3xjir+RQZ2oFaRYDOHu3buMDAOqY8eONH3YyqiQ1iWWrhWolSpVYkQYVDt27KDpww+NCCle3HqN0/BgXO/evRkRBhUe06Eoq47x85xGA3U7p/EJznfffZcRYWBRJqp0MxKkgzgdzsIfP36c0WBgHTt2jKYfdxkF0pLEkrSGlB09MYfKly+v1JdYBcfj1/xgVtQhSvi+5YSTp8s5yup2TMYX5a0qgzwNKm3N/S1c5pFaqgvPsKgsk/F1+fJlvoKNQn8eNsOxkuPEgrL9rOLNJ7j7wWQOUeSpPuaEYnge0asUkKaKmf2cs6CeOHGCEWASUVb17uMJSLFC9GWKl4tz8LPhSskqAQEBfLU9JnMIK4BTDP87PAFqB8oh39fBz7ZV+lnMzmEylygyqnB0zeVuUD+mALWx2pjrwIEDWc+bTFhAjoKJF9097N/m1Fd4W6X0Qdlv42MyvrDqIQWoa90Jak0Xs2ZOKf08ZpEzmU9Y8l2hb29LTAc9Ejs9JfOzQZxCvX62kDKvpk+fTuNV6xkl33SIzM/GKH1IdHQ063GT6ueff6YB9R13gfquwr6u3FHZ/kofgqccmcwriss7LrgL1LUyL3FI4WeXKYGKRQ6YzCu8/4DCqz7jDlA3ybzAGIWf/V7pI4x4QRgTvfbv308Daj93gLpF5gUaKBz6k62YgtdwY+Y4k3mFC2G8fFgB1E/cAepGmRcIk/m5ckp/0zC5gcn8orj491/ODVX/1ks8PF3h4V2UQB06dCjrZS8Q5bn/6nqD+pbEg+8q/NwspZdfs2YN62Uv0LVr12hAjdMb1JGc9H1Dch51j9LLnzlzhvWyl4jigoq9eoPaUebhhWR+7gZbSFlHY8eOVQI1mdP5HtVaMg9vIvEzESy1z1r6+uuvaYb/+nqCGiKT+Dxd4meaKb103759We96WZiKoj7VdL2H/7NOpveNUwJ18eLFrHe9TA0bNlQC9ZDeoK6UWVCFqUm0/uabb1jPepmmTp2qBGqS3ml/L8s8/BUnPHCGxcfHs571Mn311Vc089RqeoIqd0AvuzvHOv6y90sVL16c9aoX6v79+xAUFKQE6kC9h//vJB78JFt2TAWlv1V41TaTd6pevXpKoK7RG1S5BdJkuz/XSQnUSZMmsR71UmHfKvT/eb1BLSvz8Kt2k+SpSqB+9tlnrEe9VAcOHFAC9Qnnhnupzsu8QAvxz2xWAvW3335jPeqlSklJ4c/BKTDQXG9Q5W6L3kIBM+TKlYtdyOvliomJUQJ1it6g1lc4PxWpdOq0du3arCe9XIMHD/Z4gkqAmFwg9QLTlIZ9/Agm7xbFZb//uiPj/4DMC/zMsfKSltfp06dpAv/heoM6TWFFJ/uCR48eZT3p5cL0TYrAfyO9Qe3JuXDh2b1791hPsgUV2gi9QY1RC2qZMmVYD1pEQ4YMUeJhhd6g5lULaqdOnVgPWkTvv/++Eg/fu2NBdVcNqDNmzGA9yBZUNkt0xxHqf9WAunPnTtaDFlpQUexQFdMb1KtqQL169SrrQQuJ4vI03W+j/s1ZSENDQ+HJkyes9ywkTOdU4GKM3qCecxbUBg0asJ6zmOLi4pS4WG84UIcPH856zmLCuxk4D9/w5/Riavny5aznLCaKM1RX9YQ0h1ggzSlQ2alT6+n69etKXOA5PH9PZPpL2s2bN1nPWUy4eKaonapbNerOzkJaoEAB1msWFV5vr8BHQ71Anc9W/Ey06tKlixIfvfUC9YKzoLKCvdYVxWUU0/SAtJKa+enSpUtZj1lUc+bMUeJjnR6gLlIDKoYpmKwprCquwMfXWkOKV1onqAH1n3/+YT1mUX3++edKfFzRGtQJaiDNnz8/6y0L68SJE0qMPNQy3S9MrTetW7cu6y0LCzPmKDjJqxWoq9Rm9ffv35/1loWFlah9fHyUOCmlVdGJJ2pBnTt3Lustiytv3rxKnMS4CikWs/pDLaRoW7duZT1lcVHcQN3SFUhxgrvbFUjRzp07x3rK4oqOjlbipKcroMa5CinOTVJTU1lPWVz169dXYmWkWkgbKxU7o7FixYqxXmKCFi1a6LKNWprYLVchRWvSpAnrJSbo0KGDEitL1cRLL2gBKdqgQYNYLzFB9+7dlVj5xBlI/cQbTkArmz9/PuslJujRo4cSK/udAXWplpCi7dq1i/USE/Ts2VOJlWO0kPbWGlK0X375hfUSEw2oP9FA+iyncIGZ2tAUXpDFxNSrVy8lXv6rBCnen/6LHt40MjKS9RATL4rjKL8qgfqGHpCixcbGsh5i4kVR2kc2JzWPWPpPF1A7d+5siU7AI8FXrlzhE4SXLFkCEydOhJdffpn/fqwHi8Fu/Oe+ffvCqFGj+Ovfd+/eDZcuXbIMqM2aNVPi5bocqEP1ghQN6w55o9LT0/liGtOmTYNGjRpBSEiI6jbCY+Rt2rSBRYsWweXLl70WVIr7UW/KgbpHT1DRc3iLsNbnjh07+EVBvnz5dGuz6tWr89Devn3bq0ClqOefKAfqDT1BxY41u3BIHz16NERERICebZXdAgMD+YTzixcvegWoVapUUfrmVDlQ0/Vs7FOnTpm2YX/++Wd46aWXwM/Pz62AZjdfX1/+PcxeABkvGaGoQSWpJD0b+c6dO6Zr0OPHj0P79u35a4Y8CWh2Cw4O5q8XN2tcukiRIjTf6SsF6g8uNqDkJgEWxjKT/vzzT+jWrRvN2R6PGpYaP3LkiOlAxZPIFN8nWdVvrIsN90jqv1WsWNEUDYgHz2bPns3feG1kQLNPB/B2GTOVmado3ydyR6Yxjvq3ygaTPUeFGd1G1759+2jmToY1DGuZZXpFMZV6qLQzhSX/UlQ01NtmvfgMj8Zg4F2HYR5jgQeJLSY2ilg3Yk2J1SUWRawBsQ7EBosVEb8kFu/qCYoffvjB8KMWxbek0CSl1CB2zYkGukSsHWfCq86PHTsGZcuW1QpMDKnsFMGrqPLIj694VHgqsYtq3gMvxzVyOmViYiLNdyTSNlgBYguI3Vf4hemiF+4h9+cmT55suN0kfCcNwk2PiX0hestcOhShQ++7TXwO9Xv5+/vDxx9/bEhQse4Y5WjklCKJDSP2FbFkB6t8W9HVYWYpM3nr1i1o2rSpq4CmiEN6Cc49qih6a6fSKnFXy2j6/fffad7/hquXSpQVPSgO9fbXAU6Se/DGjRsNM9QXLVrUFUCx3tZMYuGcZ9TYmcvnENZ58+YZClSs60A5ndRFC+QefOjQIY83EN5xRHEXp5ThaDJFjIx4WjlFb/6EFtbVq1cbBtRvv/2Wpr1/0qvx1ss9+OzZsx5rGEwgGTBggCtedLcbh3hn9AJtlABjrdu3bzcEqLjQo3jnr/RqNNn5E94v5AklJCS4Mh89RaweZ2yVpp0KYDTACHd7bdiwgabtt+nVYEfkHuyJNDXM58QdMRWAYqRjnNxes8GEC97TNN+GVfTOnz/vUVAx3ZPiXdfp1Vg/yz04KSnJ7Yum8PBwNZCeIVadM59yi2fhFb8R48bx8fEeAxUTzCnec5FeDXVd7sG4G+Eu4bGOnDlzOgtomhi58OPMKzyYeYDme1u2bAmPHj3yCKgjRoyg6Y9pejXSfblVp7sSJtavX88Hu1XkKdTivEMYEfie5rvHjh3rEVBxO53i/frr0ThBcg/FkJA7hBlEKvbrt3NCcWJvUn5i52nCVlu2bHE7qBTnpdBa6dEwheQeqncuKg5heBOgigXTUM57VZQmXyM0NJQ/XuNOUeZW6LJOkL29T8/renDuS1HMILv9Tqwm5/2KEhNlZNsDD9qlpaW5DVTKU7r59WiQaM4DN0njypVyGLG3g2LCjVX0Ek27jBkzxi2QYvSHo8tC89GjMepwCud7tNa1a9egcuXKzkK6kpM53uDFWkAzXz148KDuoJ45c4amn/6rV0M0UmoELUMheCIUE4Q55zKdunHWFYbcvlFqJzxwp/cJAbwRh6K/PtWrIVoqPRy3MrUQXvZLcUdR9tIwMRxTEY6ivD0W2NVTmMlF0WdT9WqEF5UersWVPevWrXM2+wnjiQUZoxnC1EzFjKtNmzbpBiqe9KDoty56NUAbpYfv2bNH9cfhZgHltpu9rRF3apiyaglNyAqPi+uh2rVr0/RdZb0+voHSwxcsWKDqw+7evQtt27Z1BlA8GjOK8Si7zXpOqR1bt26tOaSPHz/mY+qc8lmpHHp9fLTSh6spOfnjjz86e3wZczObMRYVhYc305TaU+tk6wsXLtD04R49P7yC0gtgtWnalT/+zZs1a5azB+8uiO/BRKepSm2KgXk83+TmPNQJen50fhqYtm3bpvgxeCa9Vq1aavbr8zD2nA5ZnVBq27p16/KOQwthMWOKvqyr94ffVHoJDNDjnNOR8KgKZVZN9rIvb+k5p/FyVeAotlgXLlyoCagUhdFuc25Is/yGBi70lhj0PXDgAO9hcTVPUdTVkd0h1oKx5rJeV2pr3FnETRZXdPToUZo+fd8dH7yM49xWZwmrDpZkjGkiHI2O0IyGKSkpqkHFq0Up+rW1Oz64kxsAxaF+LmfN/Xo9hQcE7ym1f79+/VRBipVRKDKmbror7h3C6VsI+B821OuqgTT9oKbiDaU3fdOdH7tYJy+KJxLDGEu6CtPqPlfqDywX6cypAPyzFKcusDRUpDs/toC4ctMKUizr0oQx5DYhLIqJK5hvsXz5csWiH5iAQnl+baUnPhbrf6a5COhNcTUazNhxu9pylKWC8Pa9Dz/8EDZv3swbVg/EomxYlYayRr+tlpen6njxhbz+UhlymsgJZ9SZPKe33RjBGenpj80rQneBUy4+toMT6qsGMUYMIYyqfOcGSPdwBtuswRORzYn144TMpuHEunPCdesBjAtDqjCxqzpCig4slDUzkxbC08XxOkCKV5wXZ83LpKUw1zhFQ0i/8+Tiicm7hWfO/nERUIQ9jjNPhUQmk+oZjrK0Jfd0RtRsYhGsCZncGQ3AcNIVTv6UBVaLxhAXhik1T9v7PyW3MFAhTY1AAAAAAElFTkSuQmCC";
            jLabel1.setIcon(new ImageIcon(ImageDadaURI.convertDataURIToImage(imgBase64)));
        } catch (IOException ex) {
            System.out.println("ERROR: " + ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DataURITest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataURITest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataURITest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataURITest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataURITest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}